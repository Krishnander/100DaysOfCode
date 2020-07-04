array = []
n = int(input('Enter size of the list:\n'))
for i in range(n):
    temp = int(input('Enter number to add to my list:\n'))
    array.append(temp)
print(array)  
  
def sort012( a, arr_size): 
    lo = 0
    hi = arr_size - 1
    mid = 0
    while mid <= hi: 
        if a[mid] == 0: 
            a[lo], a[mid] = a[mid], a[lo] 
            lo = lo + 1
            mid = mid + 1
        elif a[mid] == 1: 
            mid = mid + 1
        else: 
            a[mid], a[hi] = a[hi], a[mid]  
            hi = hi - 1
    return a 

def printArray( a): 
    for k in a: 
        print(k)

arr_size = len(array) 
arr = sort012(array, arr_size) 
print("Array after segregation :\n") 
printArray(arr)
    
