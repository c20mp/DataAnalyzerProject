![Banner](https://kjergens.github.io/DataAnalyzerProject/data-analytics.png)

# Data Analyzer Project
CS-2 Final Project

## Summary: 
Tell me something interesting about a large dataset. Share your insights with the class.

## Skills:
ArrayList, File I/O, Objects

## Details:
Pick one of these datasets:

1. Disney movie box office earnings, all-time
2. Drug lobby spending amounts
3. NCAA Men's basketball championship tournament results since 1985
4. All of Trump's tweets.

Then use it to give me advice on one of these questions:

1. I have $50,000 dollars I'd like to invest in a Disney film. What kind of film project should I invest in to give me best chances of making my money back?

2. I want to challenge drug lobbies that are effecting health care legislation. Who should I target first?

3. I have $500 to bet on next year's NCAA basketball tournament. How should I pick a team? 

4. I'm rattled about world events and I'd feel better if I knew what's on Trump's mind. Can you give me insights? 

You will have a few weeks to do data analysis, then present it to me in class. At that time, the rest of the class and myself will give you pointers on your code. Then you have until the final class period to show me the improvements.

## Setup
1. Clone this project. (In Eclipse, Control-click anywhere in the Package Explorer > Import... > Git > Projects from git > paste this URI https://github.com/kjergens/DataAnalyzerProject.git > click Next until Finish)

## Suggested Workflow
1. Peruse the dataset. Ask yourself a specific question that can be answered by analyzing the data. 
	- E.g. In order to give me advice on which Disney film to invest in, you could ask, "Which Disney film genre has averaged the highest earnings?") 

2. On scratch paper, design an object for that one question. What information do you need to store?
  
3. Edit the Data object to be the object you designed. 
	- Tips: Keep it simple. Only include attributes you know you'll need.You can methods later if you need them, but don't write them at the start.
	- HINT: Unlike the Student object from the last project, you probably won't have attributes for every column in the dataset. 

4. In the main program, read the data from the csv file and store it in the ArrayList.
	- HINT: Unlike the StudentReport, you might want to skip certain lines of data. E.g., if you only care about National Championship game winners, skip rows concerning other games (Semi-Finals, Elite Eight, etc.).
	- HINT: Unlike the StudentReport project, you might want to count occurrances of something. E.g., if you are counting how often each team won and if North Carolina already won a Championship, don't create another North Carolina object. Instead, find North Carolina it in your list and increment its count.
  
5. If you choose to sort the ArrayList, do it after you've read in all the data from the input file. 
	- Tips on sorting: Create a new ArrayList to hold the sorted objects. Remove the max element from the original ArrayList and add it the sorted ArrayList. Keep doing that until the original ArrayList is empty.
  
6. Display the results or write them to a file.
  
7. Decide if you want to answer another question. Design an object for that question and incorporate it into your existing code.

## Grading
The grade will go up depending on how thorough the analysis. Example grades:

### B/B+
You design an object and read in data, but don't draw any conclusions.

### B+/A- 
A specific row of data is given as evidence for your conclusion. Examples:

1. "You should invest in cat-movies because the top-grossing film was 'Aristocats'."
2. "You should target Merck because they spent the highest amount on lobbies this year."
3. "You should bet on Miami State because they have won last time."
4. "Trump is thinking about cake because that's what his last tweet was about"
	
### A-/A 
An aggregation or average of data is given as evidence for your conclusion. Examples:

1. "You should invest in Action movies because the top-grossing films was have on average been Action films."
2. "You should target Merck because on average they've spent the most on lobbies over the past 5 years."
3. "You should bet on the team ranked 2nd because 2-nd ranked teams win most often."
4. "Trump is thinking about golf 5 times as much as he's thinking about oil".
	
### A
Multiple ways of looking at the data led to your conclusion. Examples:

1. "You should invest in R-rated Musicals because in the past 10 years those have been the most successful".
2. "You should target Merck because they've been increasing their spending every year for the past 5 years."
3. "You should bet on the team ranked 2nd OR the team that won last time because on average those teams have the best odds."
4. "Since becoming president, Trump has tweeted about Obama more than from before hewas president."
   
![Banner](https://kjergens.github.io/DataAnalyzerProject/data-analytics.png)
