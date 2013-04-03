#!/usr/bin/python

data = ""
f = open ("./visitors.txt","r")

#Read whole file into data
data = f.read()

#Increment the count
data = int(data) + 1

# Close the file
f.close()

# Now rewrite file to incremented value
fi = open("./visitors.txt","w+")
fi.write(str(data))
fi.close()

