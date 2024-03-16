@main def main(): Unit =
  val a = 0; // 상수
  var b = 0; // 변수

  // 명시적 및 암시적 타입
  val implicitInteger = 1;
  val explicitInteger: Int = 1;

  // 다양한 데이터 타입
  val byte: Byte = 1
  val int: Int = 1
  val long: Long = 1
  val short: Short = 1
  val double: Double = 2.0
  val float: Float = 3.0
  val bigInt: BigInt = BigInt(1234567890)
  val bigDecimal: BigDecimal = BigDecimal(123456.789)
  val char: Char = 'a'
  val string: String = "Hello, world!";
  val boolean: Boolean = true;
  val integers: List[Int] = List(1, 2, 3, 4, 5);

  // 숫자 리터럴
  val hex = 0x5
  val longLiteral = 35L
  val doubleLiteral = 3.0d
  val floatLiteral = 3.0f

  // 형식 문자열 (문자열 보간)
  val firstName = "first"
  val middleName = "middle"
  val lastName = "last"
  println(s"Full Name = $firstName $middleName $lastName")
  println(s"Full Name = ${firstName + middleName + lastName}")
  println(s"""
    Full Name Is
    ${firstName}
    ${middleName}
    ${lastName}
  """);
