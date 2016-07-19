JMeter performance test
===

What is JMeter
---

- 開源軟體
- 免費！
- 純Java開發，可跨平台
- 壓力測試與效能測試
- 編輯劇本、驗證功能、測試效能
- 不是網頁瀏覽器

Download
---
[Download](http://jmeter.apache.org/download_jmeter.cgi)

教材
---
[SEL, FCU](https://www.evernote.com/shard/s6/sh/e1b2d437-6dc8-411c-bc90-ac9113818c01/0f3e6286baac2a8fc59143d3311e0250)，逢甲軟工實驗室提供的教材

Laboratory
---

	**正式上課時 demo 用的受測系統的 IP 可能不同**

Lab1: 功能測試- Count

1. Count 為一個簡易的加法程式,此程式佈署於 http://140.134.26.7:8080/RT/Count.jsp (Count.jsp 程式之原始碼附於附錄)

Lab2: 功能測試- GuessGame

1. GuessGame 為一個簡易猜數字遊戲,佈署於 http://140.134.26.7:8080/RT/GuessGame.jsp (GuessGame.jsp 程式之原始碼附於 附錄)。

Lab3: 壓力測試- GuessGame

1. 延續 Lab 2,將執行緒改為 10 執行測試並觀察回應時間。

Lab4: Recording I

1. 延續 Lab 1,使用 Recorder 幫助建立測試案例 
2. 當建立 Recorder 之後,使用重播來執行測試案例

Lab5: Recording II

1. 建立一個 Recorder 擷取登入 Yahoo,以及在網站中進行各種活動的動作。 
2. 檢視 Recorder,觀察哪些動作被記錄下來。

Selenium
===

Install Selenium
---
1. visit [web site] (http://docs.seleniumhq.org/)
2. choose Download
3. ... Download latest released version 2.5.0 released on 01/Jan/2014 or view the Release Notes and then install some plugins. ==> click `2.5.0` to download

Read the [doc](http://docs.seleniumhq.org/docs/index.jsp) to see how does it work.
