from bs4 import BeautifulSoup
import requests
import pandas as pd
import time
# url = 'https://www.r-staffing.co.jp/tokyo/?c=y'

keyword = 'python'

url = 'https://kino-code.work/?s={}'.format(keyword)
print(url)

r = requests.get(url)
time.sleep(3)
soup = BeautifulSoup(r.text, 'html.parser')
page_na = soup.find(class_="pagination")
page_num = page_na.find_all(class_="page-numbers")
print(page_num)
pages = []
for i in page_num:
    pages.append(i.text)
print(pages)
urls = []
last_page = int(pages[-2])

if not pages:
    urls = [url]
else:
    for i in range(1, last_page + 1):
        url = 'https://kino-code.work/?s={}'.format(keyword) + '&paged={}'.format(i)
        urls.append(url)
print(urls)

links = []
titles = []
snippets = []

for i in range(len(urls)):
    r = requests.get(urls[i])
    time.sleep(3)
    soup = BeautifulSoup(r.text, 'html.parser')
    get_list_info = soup.find_all("a", class_="entry-card-wrap")
    for j in range(len(get_list_info)):
        get_list_link = get_list_info[j].attrs['href']
        links.append(get_list_link)

        get_list_title = get_list_info[j].attrs['title']
        titles.append(get_list_title)

        get_list_snippet = get_list_info[j].find(class_="entry-card-snippet").text
        snippets.append(get_list_snippet)

print(links)
print(titles)
print(snippets)

result = {
    'title' : titles,
    'link' : links,
    'snippet' : snippets 
}

df = pd.DataFrame(result)
print(df)




# print(parse_html)
# title_lists = parse_html.find_all('li')
# title_list = []
# # url_list = []

# for i in title_lists:
#     title_list.append(i.string)
#     # url_list.append(i.attrs['href'])

# print(title_list)
# # print(url_list)