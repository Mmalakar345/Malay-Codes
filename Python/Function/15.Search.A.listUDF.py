#  Wtrite a program to search a number in a list using linear search

def search(list,value):
    if value in list:
        print("Found")
    else:
        print("Not found")

# Main
list=eval(input("Enter a Positive list == > "))
value=int(input("Which number you want to search? == > "))
search(list,value) # Method call
