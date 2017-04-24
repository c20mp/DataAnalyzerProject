![Banner](https://kjergens.github.io/DataAnalyzerProject/data-analytics.png)

# Data Analyzer Project

## Summary: 
Tell me something interesting about a large dataset. Share your insights with the class.

## Details:
Pick one of these datasets:
1. Disney movie box office earnings, all-time
2. Drug lobby spending amounts
3. NCAA Men's basketball championship tournament results since 1985
4. All of Trump's tweets.

Answer an interesting question about it.
Eg.
1. I have $50,000 dollars to invest in a Disney film. Which kind of film do I have the best chances of making my money back?

2. I want to investigate if drug lobbies effect legislation around health care. Which lobbies should I target first?

3. I have $500 to bet on next year's NCAA basketball tournament. Which team should I bet on? Does the ranking of the team help predict who will win?

4. What's on Trump's mind? Of 5 or 6 categories - for example: Obama, Trump Tower, Trump Golf, Iran, Health care, and Ivanka - which does he tweet most about? Or, how often does he tweet a year? A day?

## Setup
1. Clone this project. (In Eclipse, Control-click anywhere in the Package Explorer > Import... > Git > Projects from git > paste this URI https://github.com/daltonschool/DataAnalyzerProject.git > click Next until Finish)

## Suggested Workflow
1. Peruse the dataset. Decide on a specific question you want to investigate. (E.g. In order to give me advice on which film to invest in, you could ask, "Which Disney film genre averages the highest earnings?") 

2. On scratch paper, design an object for that one question. What information do you need to store?
  
3. Edit the Data object to be the object you designed. 
	- Tips: Keep it simple. Only include attributes you know you'll need.You can methods later if you need them, but don't write them at the start.
	- HINT: Unlike the Student object from the last project, you probably won't have attributes for every column in the dataset. 

4. In the main program, read the data from the csv file and store it in the ArrayList.
  - Unlike the StudentReport, you may not want to save every line of data. For example, if you only care about National Championship game winners, don't make objects for rows concerning other games (Semi-Finals, Elite Eight, etc.).
  - Unlike the StudentReport, you might want to count occurrances of something. For example, if you are counting how often each team won, and if North Carolina already won a Championship, don't create another North Carolina object. Instead, find North Carolina it in your list and increment its count.
  
5. If you choose to sort the ArrayList, do it after you've read in all the data from the input file. 
	- Tips: Create a new ArrayList to hold the sorted objects. Remove the max element from the original ArrayList and add it the sorted ArrayList. Keep doing that until the original ArrayList is empty.
  
6. Display the results or write the results to a file.
  
7. Decide if you want to answer another question. Design an object for that question and incorporate it into your existing code.


   
![Banner](https://kjergens.github.io/DataAnalyzerProject/data-analytics.png)
