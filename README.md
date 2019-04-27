# design-patterns

## [observer pattern](https://blog.csdn.net/codingtu/article/details/89392812)
[my implementation](https://github.com/zhuzhenke/design-patterns/tree/master/observer/src/main/java/com/design/pattern/observer/me)

 my implementation of many observers to many subjects

[jdk implementation](https://github.com/zhuzhenke/design-patterns/tree/master/observer/src/main/java/com/design/pattern/observer/jdk)

jdk implementation of many observers to one subject

## [decorator pattern](https://github.com/zhuzhenke/design-patterns/tree/master/decorator/src/main/java/com/design/pattern/decorator)

## factory pattern

### [simple factory pattern](https://github.com/zhuzhenke/design-patterns/tree/master/factory-simplefactory/src/main/java/com/design/pattern/factory/simplefactory)

### [factory method pattern](https://github.com/zhuzhenke/design-patterns/tree/master/factory-factorymethod/src/main/java/com/design/pattern/factory/factorymethod)

### [abstract factory](https://github.com/zhuzhenke/design-patterns/tree/master/factory-abstractfactory/src/main/java/com/design/pattern/factory/abstractfactory)

## [adapter factory](https://github.com/zhuzhenke/design-patterns/tree/master/adapter/src/main/java/com/design/pattern/adapter)

## [facade factory](https://github.com/zhuzhenke/design-patterns/tree/master/facade/src/main/java/com/design/pattern/facade)

## [singleton factory](https://github.com/zhuzhenke/design-patterns/tree/master/singleton/src/main/java/com/design/pattern/singleton)

## [command factory](https://github.com/zhuzhenke/design-patterns/tree/master/command/src/main/java/com/design/pattern/command)
#### 命令模式：将请求封装成对象，这可以让你使用不同的请求，队列或者日志请求来参数化其他对象。命令模式也可以支持撤销操作。

- 命令模式将发出请求的对象和执行请求的对象解耦
- 在被解耦的两者之间是通过命令对象进行沟通的。命令对象封装了接收者和一个或一组动作
- 调用者通过调用命令对象的execute()发出请求，这会使得接收者的动作被调用
- 调用者可以接受命令当做参数，甚至在运行时动态地进行
- 命令可以支持撤销，做法是实现一个undo方法来回到execute()被执行前的状态
- 宏命令是命令的一种简单的延伸，允许调用多个命令，宏方法也可以支持撤销
- 实际操作时，很常见使用"聪明"命令对象，也就是直接实现了请求，而不是将工作委托给接收者
- 命令也可以用来实现日志和事务系统


## [template factory](https://github.com/zhuzhenke/design-patterns/tree/master/template/src/main/java/com/design/pattern/template)

## [strategy factory](https://github.com/zhuzhenke/design-patterns/tree/master/strategy/src/main/java/com/design/pattern/strategy)




## 设计原则
- 封装变化
- 多用组合，少用继承
- 针对接口编程，不针对实现编程
- 为交互对象之间的松耦合设计而努力
- 类应该对扩展开放，对修改关闭
- 依赖抽象，不要依赖具体类


以上说明解释摘录/参考自[《Head First设计模式》](https://www.amazon.com/Head-First-Design-Patterns-Brain-Friendly/dp/0596007124/ref=sr_1_1?crid=F3WIMSVXWGV5&keywords=head+first+design+patterns&qid=1556374615&s=gateway&sprefix=Head+First+%2Caps%2C1235&sr=8-1)