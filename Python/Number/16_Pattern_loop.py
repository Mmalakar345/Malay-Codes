 #######################   EXAMPLE 1  ########################
#1
#2 2
#3 3 3
#4 4 4 4
#5 5 5 5 5

# for row in range(1,6):
#     for col in range(1,row+1):
#         print(row,end=" ")

#     print() # go to the next line


#######################   EXAMPLE 2  ########################
#1 2 3 4 5
#1 2 3 4
#1 2 3
#1 2
#1


# for row in range(1,6):
#     for col in range(1,7-row):
#         print(col,end=" ")

#     print() # go to the next line

#  Alternative

# for i in range(5,0,-1):
#     for j in range(1,i+1):
#         print(j,end=" ")
#     print()

    
 #######################   EXAMPLE 3  ########################
# ascii value using pattern
#A
#A B
#A B C
#A B C D
#A B C D E


# #outer loop
# for i in range (65,70):
#     #inner loop
#     for j in range (65,i+1):
#         print(chr(j),end=" ")
#     print()


# for r in range(1,6):
#     ch=65
#     for i in range(1,r+1):
#         print(chr(ch),end=' ')
#         ch+=1
#     print()


 #######################   EXAMPLE 4  ########################
# ascii value using pattern
#a 
#ab 
##abc 
#abcd 
#abcde
#outer loop


# for i in range (97,102):
#     #inner loop
#     for j in range (97,i+1):
#         print(chr(j),end="")

#     print()

        

 #######################   EXAMPLE 5  ########################
# 4 5 6 7 8
# 4 5 6 7
# 4 5 6
# 4 5
# 4

# for row in range(4,10):
#     for col in range(4,13-row):
#         print(col,end=" ")

#     print() # go to the next line

# alternative

# for row in range(8,3,-1):
#     for col in range(4,row+1):
#         print(col,end=" ")

#     print() # go to the next line



#######################   EXAMPLE 5  ########################
# @ @ @ @
# @ ? ? @
# @ ? ? @
# @ @ @ @

# for row in range(1,5):
#     for col in range(1,5):
#         if row==1 or row==4 or col==1 or col==4:
#            print('@',end=" ")
#         else:
#             print('?',end=" ")
#     print()



#######################   EXAMPLE 6  ########################
# 1 3 5 7 9
# 1 3 5 7
# 1 3 5 
# 1 3
# 1
                                        
# for row in range(10,0,-2):                 
#     for col in range(1,row,+2):
#         print(col,end=" ")

#     print() # go to the next line


#######################   EXAMPLE 7  ########################
# 5 5 5 5 5
# 4 4 4 4 
# 3 3 3
# 2 2
# 1
                                       
# for row in range(5,0,-1):
#     for col in range(1,row+1):
#         print(row,end=" ")

#     print() # go to the next line

#######################   EXAMPLE 8  ########################
# @ ? @ ? @
# @ ? @ ? @
# @ ? @ ? @
# @ ? @ ? @
# @ ? @ ? @

# for row in range(1,6):
#     for col in range(1,6):
#         if col%2==1:
#            print('@',end=" ")
#         else:
#             print('?',end=" ")
#     print()

###################################################################
# Alternate user input

# lines=int(input("How many lines to print?"))
# for row in range(1,lines+1):
#     for col in range(1,lines+1):
#         if col%2==1:
#            print('@',end=" ")
#         else:
#             print('?',end=" ")
#     print()


#######################   EXAMPLE 9  ########################
# 5 4 3 2 1
# 5 4 3 2
# 5 4 3
# 5 4
# 5

# for j in range(1,6):
#     for i in reversed(range(j,6)):          #Right
#     #for i in range(5,j-1,-1):              #Right
#         print(i,end=" ")
#     print()


#######################   EXAMPLE 10  ########################

#   @
#   @ #
#   @ # @
#   @ # @ #
#   @ # @ # @

# for row in range(1,6):
#     for col in range(1,row+1):
#         if col%2==1:
#            print('@',end=" ")
#         else:
#             print('?',end=" ")
#     print()

#######################   EXAMPLE 11  ########################
# 1 
# 4 6
# 9 11 13
# 17 19 21 23

for row in range(1,5):
    for col in range(1,row+1):
        print(col+row*2-1,end=" ")
    print() # go to the next line

#######################   EXAMPLE 12  ########################
# ? ? ? ? ? 
# @ @ @ @ @
# ? ? ? ? ?
# @ @ @ @ @
# ? ? ? ? ?

# for row in range(1,6):
#     for col in range(1,6):
#         if row%2==0:
#            print('@',end=" ")
#         else:
#             print('?',end=" ")
#     print()