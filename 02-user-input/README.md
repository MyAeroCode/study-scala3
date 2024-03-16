# 사용자에게 입력 받기

## 전체 코드

```scala
import scala.io.StdIn.readLine

@main def helloInteractive(): Unit =
  println("What's your name?")
  var name = readLine();

  println("Hello, " + name + "!")
```

## 포인트

- `import ...` : 외부 메서드 불러오기
- `val name = ...` : 상수 선언
- `var name = ...` : 변수 선언
- `readLine()` : 사용자에게 한줄 입력받기

## 실행결과 예시

```
What's your name?
Lutz
Hello, Lutz!
```
