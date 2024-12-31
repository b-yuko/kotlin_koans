/*

Default arguments

Javaでfoo()のオーバーロードがいくつかあると仮定します：

public String foo(String name, int number, boolean toUpperCase) {
    return (toUpperCase ? name.toUpperCase() : name) + number;
}
public String foo(String name, int number) {
    return foo(name, number, false);
}
public String foo(String name, boolean toUpperCase) {
    return foo(name, 42, toUpperCase);
}
public String foo(String name) {
    return foo(name, 42);
}

これらのすべてのJavaのオーバーロードをKotlinの1つの関数に置き換えることができます。
foo関数の宣言を変更し、fooを使用するコードがコンパイルされるようにしてください。
デフォルト引数と名前付き引数を使用します。

*/

fun foo(name: String = "", number: Int = 42, toUpperCase: Boolean = false) =
        (if (toUpperCase) name.uppercase() else name) + number

fun useFoo() = listOf(
        foo("a"),
        foo("b", number = 1),
        foo("c", toUpperCase = true),
        foo(name = "d", number = 2, toUpperCase = true)
)
