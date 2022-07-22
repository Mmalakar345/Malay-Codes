# Write one UDF which will accept a list of tuples consisting of 3 values in each(id,name,marks) of few students And then create 3 separate tuples for id, name and marks.
# Separate all the 3 componets of students in 3 different tuples.
# Display them at the end.

Idstack=[]   
Namestack=[]   
Markstack=[]   
def push(record):
    Idstack.append(record[0])
    Namestack.append(record[1]) 
    Markstack.append(record[2])
     
# n=int(input("How many student details you want to add "))
list=[(1,"malay",87),(2,"bibhakar",27),(11,"mrinal",90)]
# for i in range(n):
    # record=eval(input("Enter student name, phno, id in a tuple"))
    # list.append(record)
for record in list:         
    push(record)
print("Number of ",len(list)," Students details display",)
Idstack=tuple(Idstack)
print("Tuple of Students Id ",Idstack)
Namestack=tuple(Namestack)
print("Tuple of Students Name ",Namestack)
Markstack=tuple(Markstack)      
print("Tuple of Students Marks ",Markstack)


