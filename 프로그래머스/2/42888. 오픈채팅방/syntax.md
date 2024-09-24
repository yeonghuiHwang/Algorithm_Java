## HashMap 사용 (HashMap<K,V>)
- HashMap은 키-값 쌍으로 데이터를 관리하는 자료구조입니다. 주로 데이터 검색 속도가 빠르기 때문에 자주 사용됩니다.
  - put(K key, V value): 키와 값의 쌍을 저장합니다.
  - get(K key): 키에 해당하는 값을 반환합니다.
'''
HashMap<String, String> userDB = new HashMap<>();
userDB.put("uid1234", "Muzi");  // uid1234 유저의 닉네임을 Muzi로 저장
String nickname = userDB.get("uid1234");  // 유저 uid1234의 닉네임을 가져옴

```java
HashMap<String, String> userDB = new HashMap<>();
userDB.put("uid1234", "Muzi");  // uid1234 유저의 닉네임을 Muzi로 저장
String nickname = userDB.get("uid1234");  // 유저 uid1234의 닉네임을 가져옴
```
## ArrayList 사용 (ArrayList<E>)
- ArrayList는 동적으로 크기가 변하는 배열로, 데이터를 순차적으로 저장하고 탐색할 때 자주 사용됩니다.
  - add(E e): 요소를 리스트에 추가합니다.
  - get(int index): 주어진 인덱스에 있는 요소를 반환합니다.
 
```java
ArrayList<String> messages = new ArrayList<>();
messages.add("Muzi님이 들어왔습니다.");
String message = messages.get(0);  // 첫 번째 메시지 가져오기
```

## 향상된 for문(for-each)
- for (String log : record)는 향상된 for문 또는 for-each라고 불리며, 배열이나 리스트의 모든 요소를 순차적으로 순회할 때 사용됩니다.
- record 배열의 모든 요소를 하나씩 log 변수에 담아 순차적으로 처리합니다.

```java
for (String item : items) {
    System.out.println(item);
}
```
여기서 items는 배열 또는 리스트이며, item은 각 요소를 가리킨다.

## split() 메소드
- String[] parts = log.split(" ");는 문자열을 공백(스페이스)을 기준으로 나누어 문자열 배열로 반환하는 메소드입니다.
- split(" ")를 통해 문자열을 공백을 기준으로 쪼갠 후, 각각의 단어가 배열에 저장됩니다.
```java
String text = "Enter uid1234 Muzi";
String[] parts = text.split(" ");  // 결과: {"Enter", "uid1234", "Muzi"}
'''
