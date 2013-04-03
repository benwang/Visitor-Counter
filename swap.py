#!/usr/bin/python

f=open("./browsernew.txt","r")

#Read whole file into data
data = f.readlines()

# Close the file
f.close()

fi=open("./browser.txt","w+")
for lin in data:
	fi.write(lin)
fi.close()

