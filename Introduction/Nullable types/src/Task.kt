/*

Nullable types

Kotlin の null safety と safe calls について学び、以下の Java コードを1つの if 式のみを使って書き直してください。

```java
public void sendMessageToClient(
    @Nullable Client client,
    @Nullable String message,
    @NotNull Mailer mailer
) {
    if (client == null || message == null) return;

    PersonalInfo personalInfo = client.getPersonalInfo();
    if (personalInfo == null) return;

    String email = personalInfo.getEmail();
    if (email == null) return;

    mailer.sendMessage(email, message);
}
```

*/


fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {
    client ?: return
    val personalInfo = client.personalInfo ?: return
    val email = personalInfo.email ?: return
    if(message.isNullOrBlank()) return
    mailer.sendMessage(email, message)
}

// 一応テストは pass するけど、なんか違う気がする・・・。

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
