lista = [10, 5, -17, 20, 50, -1, 3, -30, 10]
listaDesafio = [-12, 6, -7, -8, 1, -10, 13, -14, -5, 9, 12, 19, -17, 19, 0, -15, 17, -12, -4, -4]

def subArray(a,size):
  max_so_far = -size - 1
  max_ending_here = 0
  start = 0
  end = 0
  s = 0

  for i in range(0,size): 
    max_ending_here += a[i] 

    if max_so_far < max_ending_here: 
      max_so_far = max_ending_here 
      start = s 
      end = i 

    if max_ending_here < 0: 
      max_ending_here = 0
      s = i+1
  print("****************************************")
  #print("Maximum contiguous sum is %d" %(max_so_far))
  print("Índice de início: %d" %(start))
  print("Índice de término: %d" %(end))
  #print(a[start:end+1])
  print("****************************************")


elemento = lista

subArray(elemento, len(elemento))