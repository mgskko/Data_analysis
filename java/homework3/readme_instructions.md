# 객체지향 프로그래밍 과제 4: Inheritance 연습

담당: 손정우 교수 (jwsohn00@yonsei.ac.kr)

## 문제 소개

다음과 같이 행동하는 Role playing game의 전사(warrior)와 전사가 사용하는 무기(weapon)을 구현해 보자.

* 전사는 무기(weapon)을 장착(equip)해서 상대방에게 공격을 가할 수 있다
* 전사는 공격시 1에서 설정된 최대값까지 상대방에게 타격을 가할 수 있다. 이 때, 타격값(damage)은 난수(random number)로 구한다.
* 전사가 공격할 때 타격값은 전사가 어떤 무기(weapon)을 사용하는 가에 따라 달라질 수 있다.

전사가 사용할 수 있는 무기는 아래와 같다.

### Weapon

* 기본으로 장착된 무기이다. 맨손(bare hands)로 생각해 볼 수 있다

* 다음 난수 발생 공식에 의해 상대방의 타격값(damage)을 계산한다고 가정하자

  ```java
  int damage = (int)(Math.random() * maximumAttackPoint) + 1;
  ```

### Sword

* 맨손보다 강력한 무기이다

* 사용하면 할 수록 날(blade)이 무디어지면서 타격값(damage)이 줄어드는 특성이 있다. 이를 구현하기 위해 `sharpness` 값을 설정하고 `sharpness * damage`가 상대방에게 가해지는 최종 타격값이라고 해 보자. `sharpness`는 0과 1 사이의 값으로 1에서 시작해서 공격을 할 때마다 `deltaSharpness` 만큼 줄어든다.

  ```java
  damage = sharpness * damage;
  ```

### Bow

* 역시 맨손보다 강력한 무기이다

* 화살(arrow)가 있어야 사용할 수 있다는 특성이 있다. 이를 위해 `arrowsCapacity`만큼 최대 갯수의 화살을 가지고 다닐 수 있고 실제 남아 있는 화살의 수는 `numberOfArrows`라고 가정해 보자.

* 상대방의 타격값은 `Weapon`의 난수 발생 공식과 동일하게 계산한다

  ```java
  int damage = (int)(Math.random() * maximumAttackPoint) + 1;
  ```

* 다만, 추가로 활을 쏠 때 마다 (공격을 할 때 마다) 남아 있는 화살의 수가 하나씩 줄어드는 특성을 구현할 필요가 있다.

  ```java
  numberOfArrows = numberOfArrows - 1;
  ```

## 구현

객체지향 기법, 특히 상속(Inheritance) 기법을 잘 이용해서 다음과 같은 종류의 출력을 만들어내는 코드를 만들어 보자.

```
$ java AttackTest 
### Now comes the warrior
Name: Hercules
Health point: 50
Strength: 50

### 1: attacking with hands (default)
Attacking...
Opponent damage will be 4
No maintenance needed.
No status needs printing.

Attacking...
Opponent damage will be 4
No maintenance needed.
No status needs printing.


### 2: attacks with a shortSword
Slashing the sword...
Opponent damage will be 84 with blade shapness 1.0
Blade sharpness degraded by 0.05
Blade sharpness: 0.95

Slashing the sword...
Opponent damage will be 19 with blade shapness 0.95
Blade sharpness degraded by 0.05
Blade sharpness: 0.8999999999999999


### 3: attacks with a longBow
Shooting an arrow...
Opponent damage will be 18
Used up one arrow
Bow capacity for arrows: 20
Currently holds 19 arrows

Shooting an arrow...
Opponent damage will be 3
Used up one arrow
Bow capacity for arrows: 20
Currently holds 18 arrows
```

구현 방법:

1. LearnUS에서 `warrior.zip` 파일을 다운로드 받고 적절한 위치에 푼다.
2. 위의 화면 출력은 `AttackTest.java` 파일을 컴파일 한 뒤 `AttackTest.class` 파일을 실행했을 때 만들어지는 결과이다.
   * `w.attack()` 메소드를 한번 호출할 때 공격을 하는 것으로 가정한다
   * 공격을 할 때 마다 (1) 상대방에 가할 타격값, (2) 무기에 가해지는 변화 적용 (`Sword`의 경우 날이 무디어지고 `Bow`의 경우 활의 보유 갯수가 하나씩 줄어듬)을 구현하고 마지막으로 (3) 무기의 상태를 출력한다
3. 이를 위해서 `Sword.java`, `Bow.java`에 적절한 method들을 Overriding 기법을 응용해 구현한다. (TO FILL IN 부분을 수정)

