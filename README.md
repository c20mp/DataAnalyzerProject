# Data Analyzer Project

## Summary: 
Tell me something interesting from a large dataset. Share your insights with the class.

## Details:
You have the choice of 4 datasets:
1. Disney movie box office earnings, all-time
2. Drug lobby spending amounts
3. NCAA Men's basketball championship tournament results since 1985
4. All of Trump's tweets.

Pick one you want to analyze and answer an interesting question about it.
Eg.
1. I have $50,000 dollars to invest in a Disney film. Which kind of film do I have the best chances of making my money back?

2. I want to investigate if drug lobbies effect legislation around health care. Which lobbies should I target first?

3. I have $500 to bet on next year's NCAA basketball tournament. Which team should I bet on? Does the ranking of the team help predict who will win?

4. What's on Trump's mind? Of 5 or 6 categories - for example: Obama, Trump Tower, Trump Golf, Iran, Health care, and Ivanka - which does he tweet most about? Or, how often does he tweet a year? A day?

## Setup
1. Clone this project. (In Eclipse, Control-click anywhere in the Package Explorer > Import... > Git > Projects from git > paste this URI https://github.com/daltonschool/DataAnalyzerProject.git > click Next until Finish)

## Suggested Workflow
1. Decide on a specific question you'll answer. (E.g. Which film genre averaged the most money? or How many tweets does Trump send per year?) You will design one object per question you'll answer.
  
2. Edit the Data object. It should stay simple. Only include attributes you know you'll need. (Unlike the Student object from the last project, you probably won't have attributes for every column in the dataset). 

3. You can methods later if you need them, but don't write them at the start.

4. In the main program, read the data from the csv file and store it in the ArrayList.
  - Unlike the StudentReport, you may not want to save every line of data. For example, if you only care about National Championship game winners, don't make objects for rows concerning other games (Semi-Finals, Elite Eight, etc.).
  - Unlike the StudentReport, you might want to count occurrances of something. For example, if you are counting how often each team won, and if North Carolina already won a Championship, don't create another North Carolina object. Instead, find North Carolina it in your list and increment its count.
  
5. If you choose to sort the ArrayList, do it after you've read in all the data from the input file. Create a new ArrayList to hold the sorted objects.
    Remove the max element from the original ArrayList and add it the sorted ArrayList.
    Keep doing that until the original ArrayList is empty.
  
6. Print the records from the ArrayList or write the results to a file.
  
7. Decide if you want to answer another question. Design an object for that question and incorporate it into your existing code.
   

