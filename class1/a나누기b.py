#1008 #백준
#두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

from sys import stdin


a,b = map(float, list(stdin.readline().split(' ')))

if(b == 0):
    print(0)

else:
    print(a/b)
