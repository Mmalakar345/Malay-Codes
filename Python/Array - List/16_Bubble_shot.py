N=int(input("How many numbers do you want to enter your list ==> "))
List=eval(input("Enter number in the list ==> "))
# tepm=0
i=1
N=len(List)
while i<=N-1:
    flag=1 ## Initialisssation
    j=0     ## Initialisssation of inner loop variable
    while j<=N-i-1:
        if List[j]>List[j+1]: #swap
            List[j],List[j+1]=List[j+1],List[j]
            flag=0
        j+=1   ### end of inner loop
    if flag==1:
        break
    i+=1   ## end of fouter loop
print("Sorted List is==> ")
print(List) 