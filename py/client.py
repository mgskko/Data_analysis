import socket


s = socket.socket(socket.AF_INET,socket.SOCK_STREAM) #TCP소켓을 만듬.
if not s.connect(('127.0.0.1',50000)): #IP : 127.0.0.1, PORT : 50000에 연결함.
    print('connected server!')  
while 1: #무한으로 루프를 돌면서 계산.
    message = input('input sachick(q to quit,0 to initialize) : ') #입력받아서
    if message=='q' or message=='Q': #Q면 계산종료.
        break
    s.sendall(message.encode('utf-8'))
    print(s.recv(1000).decode('utf-8')) 
