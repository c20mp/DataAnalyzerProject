![Banner](https://kjergens.github.io/DataAnalyzerProject/data-analytics.png)

# Data Analyzer Project
CS-2 Final Project

## Summary: 
Tell me something interesting about a large dataset. Share your insights with the class.

## Skills:
ArrayLists, File I/O, Objects

## Details:
Pick one of these datasets:

1. Disney movie box office earnings, all-time
2. Drug lobby spending amounts
3. NCAA Men's basketball championship tournament results since 1985
4. All of Trump's tweets.

Then use it to give me advice on ONE of these questions:

1. I have $50,000 dollars I'd like to invest in a Disney film. What kind of film project has the best chances of making my money back?

2. I want to challenge drug lobbies that are effecting health care legislation. Who should I target?

3. I have $500 to bet on next year's NCAA basketball tournament. How should I pick a team? 

4. I'm rattled about world events and I'd feel better if I knew what's on Trump's mind. Can you give me insights? 

You will have a few weeks to do data analysis, then present it to me in class. At that time, the rest of the class and myself will give you pointers on your code. Then you have until the final class period to show me the improvements.

## Setup
1. Clone this project. (In Eclipse, Control-click anywhere in the Package Explorer > Import... > Git > Projects from git > Clone URI > paste this URI https://github.com/kjergens/DataAnalyzerProject.git > click Next until Finish)
2. Make sure the csv files open in the Text Editor. Right-click on any of the csv files > Open With.. > Other... > Internal Editors > Text Editor > select both checkboxes to make it stick > OK.

## Suggested Workflow
1. Peruse the dataset. Ask yourself a specific question that can be answered by analyzing the data. 
	- E.g. In order to give me advice on which Disney film to invest in, you could ask, "Which Disney film genre has averaged the highest earnings?") 

2. On scratch paper, design an object for that one question. What information do you need to store?
  
3. Edit the Data object to be the object you designed. 

	- Tips: Keep it simple. Only include attributes you know you'll need. Add methods later if you need them, but don't write them at the start.
	
	- HINT: Unlike the Student object from the last project, you probably won't have attributes for every column in the dataset. You will probably only have 2 or 3 attributes.
	
	- HINT: For the Disney gross earnings use <b>long</b> not <b>int</b>. They made too much money to hold in an <b>int</b>!

4. In the main program, read the data from the csv file and store it in the ArrayList.
	- HINT: Skip the the first row of the csv which is the header columns.

	- HINT: You might want to skip certain lines of the file. E.g., if you only care about National Championship game winners skip rows concerning other games (Semi-Finals, Elite Eight, etc.).
	
	- HINT: You might want to count occurrances of something. E.g., if you are counting how often each team won and if North Carolina already won a Championship, don't create another North Carolina object. Instead, find North Carolina it in your list and increment its count.
  
5. If you choose to sort the ArrayList, do it after you've read in all the data from the input file. 

	- Tips on sorting: 
		- (Plan A) Create a new ArrayList to hold the sorted objects. Remove the max element from the original ArrayList and add it the sorted ArrayList. Keep doing that until the original ArrayList is empty. 
		- OR (Plan B) Research implementing Comparable and the compareTo() function 
		- OR (Plan C) Research Comparators with Array.sort().
  
6. Display the results or write them to a file.
  
7. Decide if you want to answer another question from the same dataset. Design an object for that question and incorporate it into your existing code.

## Grading
The grade will go up depending on how thorough the analysis and/or how well-coded it is. Rubric:

### B/B+
You design an object and read in data, but don't draw any conclusions.

### B+/A- 
You design an object and read in data and give a specific row of data as evidence for your conclusion. For example you might say to me:

1. "You should invest in cat-movies because the top-grossing film was 'Aristocats'."
2. "You should target Merck because they spent the highest amount on lobbies this year."
3. "You should bet on Miami State because they have won last time."
4. "Trump is thinking about cake because that's what his last tweet was about"

Then you show your data results that support your conclusion. 

### A-/A 
You design an object and read in data and give a count or average of data as evidence for your conclusion. For example you might say to me:

1. "You should invest in Action movies because the top-grossing films was have on average been Action films."
2. "You should target Merck because on average they've spent the most on lobbies over the past 5 years."
3. "You should bet on the team ranked 2nd because 2-nd ranked teams win most often."
4. "Trump is thinking about golf 5 times as much as he's thinking about oil".

Then you show your data results that support your conclusion. 

	
### A/A+
You design an object and read in data and give multiple data points to support your conclusion. For example you might say to me:

1. "You should invest in R-rated Musicals because in the past 10 years those have been the most successful".
2. "You should target Merck because they've been increasing their spending every year for the past 5 years."
3. "You should bet on the team ranked 2nd OR the team that won last time because on average those teams have the best odds."
4. "Since becoming president, Trump has tweeted about Obama more than from before hewas president."

Then you show your data results that support your conclusion. 


### Final notes on grading:
1. There is flexiblity in grading for well-written, professionally-styled code, even if it doesn't totally work. Show effort, and explain what the plan for analysis was, and those things will earn points.
2. Your work MUST BE YOUR OWN. There is a no-tolerance policy for copying anyone else's work. 
   
![Banner](https://kjergens.github.io/DataAnalyzerProject/data-analytics.png)
