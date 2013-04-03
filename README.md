Visitor-Counter
===============

CIS191--Project3--PHP, Python, and Java

At https://www.fling.seas.upenn.edu/~benwang/cgi-bin/index.php, I have set up a
script that keeps track of how many visitors have visited a webpage, what
browser is being used, and how many of the visitors have used that particular
browser.

To get the number of visitors that have visited a webpage, index.php calls 
getVisitors.py, which checks a number in the textfile visitors.txt.  Each time
you visit the page, incrementVisitors.py is also called.  This increases by one
the number found in visitors.txt.  In this way, the visitors count increases
with every webpage visit.

I used a script from www.php.net to help me figure out what browser is being
used (along with a bunch of other information that I may use for future
projects), but then I wrote a java script to help me keep count of the number of
users using each particular browser (I only account for Mozilla, Google, Apple,
Internet (Explorer), Opera, and Netscape).

PopularUserPrefs.java keeps track of the number of users in browser.txt and puts
the new information into browsernew.txt.  I then call swap.py which takes the
contents of browsernew.txt and writes them into browser.txt.

Now, if you visit the website from Firefox, the site will tell you that you are
visitor #___, and the ____th user to be using Firefox.

I thought this was pretty neat--I ended up writing a fair amount of Java and
using Python to make the method compatible.  I don't know if this is considered
extra credit worthy.
