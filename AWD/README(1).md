# SEProject

Name: 李双威   id: 11910218

Name: 胡鸿飞   id: 11911412

Name: 唐一博   id: 11910906

Name: 于松琦   id: 11910910

Name: 季忠豪   id: 11910906

## Project - 1     Last-Launcher

Links : https://github.com/SubhamTyagi/Last-Launcher

- Diversity of team members:

| Name   | Role                                |
| ------ | ----------------------------------- |
| 于松崎 | Leader                              |
| 唐一博 | Developer                           |
| 于松崎 | Tester                              |
| 季忠豪 | Developer & Documentation (JavaDoc) |

###  A - All the issues that our group have chosen.

- Issue #28   Link:https://github.com/SubhamTyagi/Last-Launcher/issues/28
- Reason:  This problem is challenging, and the authors have proposed some backup implementations that we can build on to solve the problem
- Issue #135 Link:https://github.com/SubhamTyagi/Last-Launcher/issues/135
- Reason: This question helps us understand the code, and in a lot of code, understand the key points to solve the problem. The problem itself is not difficult to implement
- Issue #167 Link:https://github.com/SubhamTyagi/Last-Launcher/issues/167
- Reason: This question can give us a clue as to how to solve some of the problems and help us understand the time related content of Android. In fact, we tried to solve problem #142, but problem #142 has already been used by other students. But we're moving fast, and our implementation is really practical, and we don't want to give up on this issue.

### B - Write 2 test scenario for each issue.

- Issue #28:
  - Example positive test scenario : At intervals, check whether the current time meets the preset time. If so, a backup window is displayed.
  - Example negative test scenario: An exception is thrown or there are no pop-ups when a specific time is reached.
- Issue #135:
  - Example positive test scenario : When the app is launched, the app name for list sorting appears.
  - Example negative test scenario: When the app is launched, the app name appears in horizontal order.
- Issue #167:
  - Example positive test scenario :Change the theme, exit the APP, enter the app again, the app will set the theme according to the current time.
  - Example negative test scenario:Change the theme, exit the APP, enter the app again, the theme of the app has not changed.

### C - Implement all the user stories of the issues

| TimeLine | User Story                                                   |
| -------- | ------------------------------------------------------------ |
| week 6   | "Understand code and recurrence problems"                    |
| week 7   | "Change layout to make a list  #135"                         |
| week 8   | "Testing existing backups",  "Learning acquisition time"     |
| week 9   | "Try changing the theme by the current time",                |
| week 10  | "Try backing up by current time", "Test changing themes", "Test backups" |

- PR for issue #28 : https://github.com/SubhamTyagi/Last-Launcher/pull/175
- PR for issue #135: https://github.com/SubhamTyagi/Last-Launcher/pull/174
- PR for issue #167: https://github.com/SubhamTyagi/Last-Launcher/pull/169

### D - Run Checkstyle, SpotBugs, and PMD 

We run all of three plugins, and fixed errors in our modified part.

### E - Write meaningful Javadoc comments

- Issue #28 and Issue #167 have  written in code.

- Issue #135 has no no new methods added.

### F - Write  Espresso Test

- Issue #135 and Issue #167 have written espresso test.

- Issue #28 has new window so that it can not be tested.

### G - Schedule

| TimeLine | User Story                                                   |
| -------- | ------------------------------------------------------------ |
| week 12  | "Find the list of app names #159", "Find the bug where it is#98" |
| week 13  | "Learn to Delete properly #159", "Try to resolve the ranaming topic issue" |
| week 14  | "Time to be displayed #131",  "Make Test for #159, #98"      |
| week 15  | "Make Test for #131", "Make Report"                          |

### H - Lab 3 - TA G slot 2



## Project - 2    Joinery

Links : https://github.com/cardillo/joinery

- Diversity of team members:

| Name   | Role                                |
| ------ | ----------------------------------- |
| 李双威 | Leader                              |
| 胡鸿飞 | Developer & Documentation (JavaDoc) |
| 李双威 | Developer &Tester                   |

### A - All the issues that our group have chosen.

- Issue #107  Link: https://github.com/cardillo/joinery/issues/107

  Reason: When we first see this question, we found that we have the same problem. Doesn't it need to specify a special encoding when reading .csv files? Out of curiosity, we want to help him and solve our doubts, too.

- Issue # 92  Link: https://github.com/cardillo/joinery/issues/92

  Reason: We think this problem is very important. If the data read from the database is all in string format, it will become very inconvenient for data calculation, and solving this problem can help us understand the internal structure of joinery.

### B - Write 2 test scenario for each issue.

- Issue # 92	

  - Positive Test Scenario: Connect to the database, create a table, insert some date and double data, and then read them from the database to judge the category. They belong to date or double types.
  - Negative Test Scenario: Connect to the database, create a table, insert some data that do not belong to date or double type, and then read them out from the database to judge the category, which belong to string type.

- Issue # 107

  - Positive Test Scenario: We prepared two csv file, encoding with UTF-8 and GBK respectively, The tests required the file to be read correctly in the correct encoding, and some validation tests were done on the contents of the file.
  - Negative Test Scenario: Read the file with incorrect encoding and the test will fail and print an error message.


### C - Implement all the user stories of the issues

| TimeLine | User Story                                          |
| -------- | --------------------------------------------------- |
| week 6   | "read and understand the issues"                    |
| week 7   | "analyze the demand"                                |
| week 8   | "modify the method of readsql()"                    |
| week 9   | "add a filter to readcsv()" "write junit test case" |
| week 10  | "canonical code style"                              |

- PR for issue #92  : https://github.com/cardillo/joinery/pull/112
- PR for issue #107: https://github.com/cardillo/joinery/pull/113

### D - Run Checkstyle, SpotBugs, and PMD 

We run all of three plugins, and fixed errors in our modified part except for Magic number of issue#107.

### E - Write meaningful Javadoc comments

- Both Issue #92 and Issue #107 have  written in code.

### F - Write JUnit Test

- Issue #92 and Issue #107 have written junit test.


### G - Schedule

| TimeLine | User Story                               |
| -------- | ---------------------------------------- |
| week 12  | "analyze the demand"                     |
| week 13  | "try to delete some bad code "           |
| week 14  | "make a test"                            |
| week 15  | "canonical code style" "complete report" |

### H - Lab 3 - TA G slot 2



