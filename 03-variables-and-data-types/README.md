# 변수와 데이터 타입

## 변수 선언

```scala
val a = 0; // 상수
var b = 0; // 변수
```

## 명시적 및 암묵적 타입 변수 선언

```scala
val implicitInteger = 1;
val explicitInteger: Int = 1;
```

## 데이터 타입

- `Byte`
- `Int`
- `Long`
- `Short`
- `Double`
- `Float`
- `BigInt`
- `BigDecimal`
- `Char`
- `String`
- `Boolean`
- `List[Type]`

### 숫자 리터럴

```scala
val hex = 0x5
val longLiteral = 35L
val doubleLiteral = 3.0d
val floatLiteral = 3.0f
```

### 문자열 보간자 (s Interpolator, s-string)

```scala
val firstName = "first"
val middleName = "middle"
val lastName = "last"

println(s"Full Name = $firstName $middleName $lastName")
println(s"Full Name = ${firstName + middleName + lastName}")

// 멀티라인 문자열
println(s"""
    Full Name Is
    ${firstName}
    ${middleName}
    ${lastName}
""");
```

- 문자열 앞에 `s` 를 붙이면 `$varName` 또는 `${expression}` 사용 가능
