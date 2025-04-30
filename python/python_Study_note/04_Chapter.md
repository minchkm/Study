Chapter 4. 리스트와 튜플
4.1 리스트(List)
리스트는 여러 값을 순서대로 저장하는 자료구조임.
파이썬에서 가장 많이 쓰이는 자료형 중 하나임.
리스트는 대괄호([])로 만들고, 요소는 쉼표(,)로 구분함.
리스트는 값을 자유롭게 추가, 삭제, 변경할 수 있음(가변 자료형).

예시:

```python
fruits = ["apple", "banana", "cherry"]
print(fruits[0])        # 'apple' 출력
fruits.append("orange") # 리스트 끝에 'orange' 추가
fruits[1] = "grape"     # 'banana'를 'grape'로 변경
print(fruits)           # ['apple', 'grape', 'cherry', 'orange']
리스트 주요 메서드
```
| 메서드      | 설명                   | 예시                      |
|-------------|------------------------|---------------------------|
| append      | 리스트 끝에 값 추가     | fruits.append("melon")    |
| insert      | 원하는 위치에 값 추가   | fruits.insert(1, "kiwi")  |
| pop         | 마지막 값 제거/반환     | fruits.pop()              |
| remove      | 특정 값 제거           | fruits.remove("apple")    |
| sort        | 오름차순 정렬          | fruits.sort()             |
| reverse     | 역순 정렬              | fruits.reverse()          |
| count       | 값 개수 세기           | fruits.count("apple")     |
| index       | 값의 인덱스 찾기       | fruits.index("grape")     |
리스트 슬라이싱
슬라이싱을 사용하면 리스트의 일부만 쉽게 추출할 수 있음.

```python
nums = [1, 2, 3, 4, 5]
print(nums[1:4])   # [2, 3, 4]
print(nums[:3])    # [1, 2, 3]
print(nums[::2])   # [1, 3, 5]
print(nums[::-1])  # [5, 4, 3, 2, 1] (역순)
```
리스트와 for문
리스트의 모든 요소를 하나씩 처리할 때는 for문을 자주 사용함.

```python
names = ["Tom", "Jane", "Mike"]
for name in names:
    print(name)
```
4.2 튜플(Tuple)
튜플은 리스트와 비슷하지만, 한 번 생성하면 값을 변경할 수 없음(불변 자료형).
소괄호(())로 만듦.

예시:

```python
point = (10, 20)
print(point[0])   # 10
# point[0] = 30   # 오류 발생(튜플은 값 변경 불가)
튜플은 리스트보다 메모리 사용이 적고, 값이 변하지 않아야 할 때 사용함.
```

튜플과 리스트 비교
text
| 구분   | 리스트(list)         | 튜플(tuple)           |
|--------|----------------------|-----------------------|
| 기호   | []                   | ()                    |
| 변경   | 요소 변경/삭제 가능  | 변경/삭제 불가        |
| 속도   | 느림                 | 빠름                  |
| 용도   | 데이터 수정 필요할 때 | 데이터 고정할 때      |
4.3 리스트와 튜플의 활용
여러 값을 한 번에 반환하는 함수에서 튜플을 자주 사용함.

리스트는 데이터 추가, 삭제, 정렬 등 다양한 작업에 적합함.

예시: 함수에서 여러 값 반환

```python
def get_min_max(numbers):
    return min(numbers), max(numbers)

nums = [3, 7, 1, 9]
min_val, max_val = get_min_max(nums)
print("최솟값:", min_val, "최댓값:", max_val)
```
4.4 리스트 컴프리헨션
리스트 컴프리헨션은 리스트를 간결하게 만드는 파이썬만의 문법임.

예시: 1~10 중 짝수만 리스트로 만들기

```python
evens = [i for i in range(1, 11) if i % 2 == 0]
print(evens)   # [2, 4, 6, 8, 10]
```
4.5 연습문제
5명의 이름을 리스트에 저장하고, for문으로 모두 출력하는 코드 작성.

1~10까지의 정수 중 짝수만 리스트에 저장하고 출력하는 코드 작성.

4.6 연습문제 풀이
```python
# 1번
names = ["Tom", "Jane", "Mike", "Sara", "Bob"]
for name in names:
    print(name)
```
```python
# 2번
evens = []
for i in range(1, 11):
    if i % 2 == 0:
        evens.append(i)
print(evens)
```
