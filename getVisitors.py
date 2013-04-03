#!/usr/bin/python
import sys

f = open ("./visitors.txt","r")

#Read whole file into data
data = f.read()

#Print it
print data

# Close the file
f.close()

# Return it
sys.exit(data)


