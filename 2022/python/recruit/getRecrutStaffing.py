from bs4 import BeautifulSoup
import requests
import pandas as pd
import time
from requests_html import HTMLSession

session = HTMLSession()
keyword = '大門駅'
size = 1000

url_block1 = 'https://www.r-staffing.co.jp/sol/op21/sd02/?sort=1&pageNo=1&hyouziSuu={}'.format(size)
url_block2 = '&freeword={}'.format(keyword)
url_block3 = '&kinmuArea=C0000&'
url = url_block1 + url_block2 + url_block3
print(url)

# r = requests.get(url)
r = session.get(url)
time.sleep(3)
# id_name = r.html.render()
print(r.html.url)
print(r)
# r.html.render()
# soup = BeautifulSoup(r.text, 'html.parser')
# print(soup)
# get_list_info = soup.find_all("div")
# print(get_list_info)
# for j in range(len(get_list_info)):
#     get_list_link = get_list_info[j].attrs['href']
#     links.append(get_list_link)

# soup = BeautifulSoup(r.text, 'html.parser')
# page_na = soup.find(class_="_stm_paging")
# page_num = page_na.li
# print(page_num)
# pages = []
# for i in page_num:
#     pages.append(i.text)
# print(pages)
# urls = []
# last_page = int(pages[-2])

# if not pages:
#     urls = [url]
# else:
#     for i in range(1, last_page + 1):
#         url = 'https://kino-code.work/?s={}'.format(keyword) + '&paged={}'.format(i)
#         urls.append(url)
# print(urls)

# links = []
# titles = []
# snippets = []

# for i in range(len(urls)):
#     r = requests.get(urls[i])
#     time.sleep(3)
#     soup = BeautifulSoup(r.text, 'html.parser')
#     get_list_info = soup.find_all("a", class_="entry-card-wrap")
#     for j in range(len(get_list_info)):
#         get_list_link = get_list_info[j].attrs['href']
#         links.append(get_list_link)

#         get_list_title = get_list_info[j].attrs['title']
#         titles.append(get_list_title)

#         get_list_snippet = get_list_info[j].find(class_="entry-card-snippet").text
#         snippets.append(get_list_snippet)

# print(links)
# print(titles)
# print(snippets)

# result = {
#     'title' : titles,
#     'link' : links,
#     'snippet' : snippets 
# }

# df = pd.DataFrame(result)
# print(df)
