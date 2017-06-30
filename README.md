# TS3BBCodeFormatter

A simple util to make some beautiful text messages! 

## Build

Clone this repo:

```
git clone https://github.com/Songbird0/TS3BBCodeFormatter.git
```

Run `mvn clean install package` in your root directory.

In your `pom.xml` add:

```xml
    <dependency>
      <groupId>fr.songbird.ts3bbcode</groupId>
      <artifactId>TS3BBCodeFormatter</artifactId>
      <version>0.1.0-SNAPSHOT</version>
    </dependency>
```

Enjoy!

## Examples

In the `test` project directory, all unit tests are available. For fun, here's an example:

```java

final BBcodeFormatter format = new BBcodeFormatter("Hi, I'm ")
.append("Songbird", new BBcodeColorTag(Color.RED), new BBcodeBoldTag()).append(".")
.appendCarriageReturn()
.append("I'm 19 years old and I'm a happy Java Developer ! :D")
.appendCarriageReturn()
.append("Feel free to look at ")
.append("my github ", new BBcodeURLTag("https://github.com/Songbird0")).append("!");

// you create a TeamSpeak API instance, then

apiInstance.sendServerMessage(format.toBBcodeString());
```

That's it! Keep in mind that you can create more complex bbcode strings with it! Have fun!
