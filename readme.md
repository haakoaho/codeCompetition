#Code competition usage document

##GET {domain}/challenge
You will receive a json object with all challenges.

##GET {domain}/challenge/highScore?id={1,2,3}
You will receive a json object with the top 5 scores of the specified id 1,2 or 3.

##POST {domain}/challenge/submitScore
Body is a raw JSON with the values of taskId which you get from the first get request. Language choice code see https://rextester.com/main for that. Input: your code. Tips: You can use https://www.freeformatter.com/json-escape.html to escape everything so that you will not get any errors. You can also unescape the request body in the same link to read the Python code in the examples. Name: the name in your high score. Examples of request bodies.

```json
{
"taskId" : 1,
"languageId" : 5,
"input" : "print(\"hello world\")",
"name" : "Håkon"
}
```
```json
{
"name" : "Håkon",
"taskId" : 2,
"languageId" : 5,
"input" : "import sys,re\r\ns=\"\"\r\nfor a in sys.stdin.read().split(';'):\r\n    a=int(a)\r\n    if re.search(r'^1?$|^(11+?)\\1+$','1'*a):\r\n        s+=\"0\"\r\n    else:\r\n        s+=\"1\"\r\nprint(s)"
}
```
```json
{
"name" : "Håkon",
"taskId" : 3,
"languageId" : 5,
"input" : "import sys\r\nfrom collections import defaultdict\r\ntotal = 0\r\ndictCounter = defaultdict(int)\r\nfor char in sys.stdin.readline().split():\r\n    dictCounter[char] += 1\r\nfor key in dictCounter:\r\n    if key == 'A':\r\n        a = dictCounter[key]\r\n        a = a - a\/\/3\r\n        total += a*5\r\n    elif key == 'B':\r\n        a = dictCounter[key]\r\n        total += a*10\r\n    elif key == 'C':\r\n        a = dictCounter[key]\r\n        total += a*10 +5\r\nprint(total)\r\n     "
}
```