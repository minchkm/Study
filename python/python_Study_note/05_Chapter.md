Chapter 5. 딕셔너리와 집합
5.1 딕셔너리(Dictionary)
딕셔너리는 **키(key)와 값(value)**이 한 쌍으로 저장되는 자료구조임.
리스트나 튜플처럼 순서가 아니라, 키를 통해 원하는 값을 바로 찾을 수 있음.
중괄호({})로 만들고, 각 요소는 키:값 형태로 작성함.
키는 반드시 고유해야 하며, 값은 중복될 수 있음.

예시:

```python
person = {
    "name": "Alice",
    "age": 25,
    "city": "Seoul"
}
print(person["name"])    # 'Alice' 출력
print(person["age"])     # 25 출력
딕셔너리에서 존재하지 않는 키로 값을 꺼내면 오류가 발생함.
```
```python
dic = {'python': '파이썬', 'java': '자바'}
print(dic['python'])     # '파이썬'
# print(dic['c++'])      # KeyError 발생
새로운 키-값 쌍을 추가할 수도 있고, 기존 값을 변경할 수도 있음.
```
```python
dic['c++'] = '씨플플'
print(dic['c++'])        # '씨플플'
dic['python'] = 'PYTHON'
print(dic['python'])     # 'PYTHON'
```
딕셔너리 주요 특징
| 특징            | 설명                                            |
|-----------------|-------------------------------------------------|
| 중괄호 사용     | {}로 생성함                                     |
| 키-값 쌍        | "키": 값 형태로 작성함                          |
| 키의 중복 불가  | 같은 키는 한 번만 저장, 마지막 값으로 덮어씀     |
| 값의 중복 허용  | 값은 중복될 수 있음                             |
| 순서 없음       | 파이썬 3.7부터 입력 순서 기억, 이전은 순서 없음  |
| 변경 가능       | 값 추가/수정/삭제 가능함                        |
딕셔너리 주요 메서드

| 메서드        | 설명                                   | 예시                              |
|---------------|----------------------------------------|-----------------------------------|
| keys()        | 모든 키 반환                           | dic.keys()                        |
| values()      | 모든 값 반환                           | dic.values()                      |
| items()       | (키, 값) 쌍 반환                      | dic.items()                       |
| get(key)      | 키에 해당하는 값 반환, 없으면 None     | dic.get('python')                 |
| pop(key)      | 키에 해당하는 값 삭제 및 반환          | dic.pop('java')                   |
| clear()       | 모든 요소 삭제                         | dic.clear()                       |
| update(dict)  | 다른 딕셔너리의 요소 추가/수정         | dic.update({'go':'고'})           |
예시:

```python
dic = {'a': 1, 'b': 2, 'c': 3}
print(dic.keys())      # dict_keys(['a', 'b', 'c'])
print(dic.values())    # dict_values([1, 2,[3])
print(dic.items())     # dict_items([('a', 1), ('b', 2), ('c', 3)])
print(dic.get('d'))    # None (KeyError 대신 None 반환)
딕셔너리 반복문
딕셔너리의 모든 키, 값, 쌍을 반복문으로 처리할 수 있음.
```
```python
scores = {"Tom": 90, "Jane": 85, "Mike": 95}
for name in scores:
    print(name, scores[name])

for key, value in scores.items():
    print(f"{key}의 점수는 {value}점임")
```
딕셔너리에서 키의 조건
키는 변경 불가능(immutable)한 자료형만 사용 가능함.
(숫자, 문자열, 튜플 등은 가능하지만 리스트, 집합 등은 불가)

값은 어떤 자료형도 가능함.

5.2 집합(Set)
집합은 중복을 허용하지 않고, 순서가 없는 자료구조임.
중괄호({})로 만들고, 각 요소는 쉼표로 구분함.
수학의 집합 개념과 유사함.

예시:

```python
numbers = {1, 2, 3, 2, 1}
print(numbers)       # {1, 2, 3} (중복 제거됨)
빈 집합을 만들 때는 set()을 사용해야 함.
a = {}는 빈 딕셔너리임.

empty_set = set()
```
집합 주요 메서드 및 연산

| 메서드/연산      | 설명                       | 예시                          |
|------------------|----------------------------|-------------------------------|
| add(값)          | 값 추가                    | s.add(4)                      |
| remove(값)       | 값 삭제                    | s.remove(2)                   |
| union(|)         | 합집합                     | a | b                         |
| intersection(&)  | 교집합                     | a & b                         |
| difference(-)    | 차집합                     | a - b                         |
| issubset()       | 부분집합 여부              | a.issubset(b)                 |
예시:

```python
a = {1, 2, 3}
b = {3, 4, 5}
print(a | b)    # {1, 2, 3, 4, 5}
print(a & b)    # {3}
print(a - b)    # {1, 2}
```
5.3 딕셔너리와 집합의 활용
딕셔너리는 이름표가 붙은 여러 데이터를 한 번에 관리할 때 유용함.

집합은 리스트나 튜플에서 중복을 제거하거나, 교집합·합집합 등 집합 연산이 필요할 때 사용함.

예시: 리스트에서 중복 제거

```python
nums = [1, 2, 2, 3,4][4][5]
unique_nums = list(set(nums))
print(unique_nums)    # [1,2][3][4][5] (순서는 보장되지 않음)
```
5.4 연습문제
과목별 점수를 딕셔너리로 저장하고, 모든 과목의 평균을 구하는 코드 작성.

두 집합 {1,3,5,7}, {3,6,7,9}의 합집합과 교집합을 구하는 코드 작성.

5.5 연습문제 풀이
```python
# 1번
scores = {"국어": 90, "수학": 85, "영어": 95}
avg = sum(scores.values()) / len(scores)
print(f"평균: {avg}")
```
```python
# 2번
a = {1, 3, 5, 7}
b = {3, 6, 7, 9}
print("합집합:", a | b)
print("교집합:", a & b)
```
