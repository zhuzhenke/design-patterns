# design-patterns

## [observer pattern 观察者模式](https://blog.csdn.net/codingtu/article/details/89392812)
[my implementation](https://github.com/zhuzhenke/design-patterns/tree/master/observer/src/main/java/com/design/pattern/observer/me)
#### 观察者模式：在对象之间定义一对多的依赖，这样一来，当一个对象改变状态，依赖它的对象都会收到通知，并自动更新。

- 观察者模式定义了对象之间一对多的关系
- 主题(也就是可观察者)用一个共同的接口来更新观察者
- 观察者和可观察者之间用松耦合方式结合，可观察者不知道观察者的细节，只知道观察者实现了观察者接口
- 使用此模式时，你可从被观察者出推(push)或拉(pull)数据(然而，推方式被认为更"正确")
- 有多个观察者时，不可以依赖特定的通知次序
- Java有很多观察者模式的实现，包括了通用的java.util.Observable
- 要注意java.util.Observable实现上所带来的一些问题(多重继承问题)
- 如果有必要的话，可以实现自己的Observable，这并不难，不要害怕。(例如需要实现多对多关系时)
- Swing大量观察者模式，许多GUI框架也是如此
- 此模式也被应用在许多地方，例如JavaBeans、RMI

 my implementation of many observers to many subjects

[jdk implementation](https://github.com/zhuzhenke/design-patterns/tree/master/observer/src/main/java/com/design/pattern/observer/jdk)

jdk implementation of many observers to one subject

## [decorator pattern 装饰者模式](https://github.com/zhuzhenke/design-patterns/tree/master/decorator/src/main/java/com/design/pattern/decorator)
#### 装饰者模式动态地将责任附加到对象上，若要扩展功能，装饰者提供了比集成更有弹性的替代方案。

- 实际应用：Java I/O ,如InputStream中，FileInputStream/ByteArrayInputStream等是被装饰者，FilterInputStream是一个抽象的装饰者，而BufferedInputStream\LineNumberInputStream是具体装饰者
- 继承是扩展形式之一，但不见得是达到弹性设计的最佳方式
- 在我们的设计中，应该允许行为可以被扩展，而无须修改现有的代码
- 组合和委托可用于在运行时动态地加上新的行为
- 除了继承，装饰者模式也可以让我们扩展行为
- 装饰者模式意味着一群装饰者类，这些类用来包装具体组件
- 装饰者类反映出被装饰的组件类型(事实上，他们具有相同的类型，都经过接口或继承实现)
- 装饰者可以再被装饰者的行为前面与/或后面加上自己的行为，甚至将被装饰者的行为整个取代掉，而达到特定的目的。
- 你可以用无数个装饰者包装一个组件
- 装饰者一般对组件的客户是透明的，除非客户程序依赖于组件的具体类型
- 装饰者会导致设计中出现许多小对象，如果过度使用，会让程序变得很复杂

## factory pattern

### [simple factory pattern 简单工厂模式](https://github.com/zhuzhenke/design-patterns/tree/master/factory-simplefactory/src/main/java/com/design/pattern/factory/simplefactory)
#### 简单工厂其实并不是一个设计模式，反而比较像一种编程习惯。

### [factory method pattern 工厂方法模式](https://github.com/zhuzhenke/design-patterns/tree/master/factory-factorymethod/src/main/java/com/design/pattern/factory/factorymethod)
#### 工厂方法模式定义了一个创建对象的接口，单由子类决定要实例化的类是哪一个。工厂方法让类吧实例化推迟到了子类。

- 工厂方法使用的是继承
- 工厂方法只负责将客户从具体类型中解耦

### [abstract factory 抽象工厂模式](https://github.com/zhuzhenke/design-patterns/tree/master/factory-abstractfactory/src/main/java/com/design/pattern/factory/abstractfactory)
#### 抽象工厂模式提供了一个接口，用于创建相关或依赖的对象的家族，而不需要明确指定具体类。

- 抽象工厂使用的是对象的组合
- 抽象工厂用来创建一个产品家族的抽象类型 


#### factory pattern总结
- 所有的工厂都是用来封装对象的创建
- 简单工厂，虽然不是真正的设计模式，但是仍不失为一个简单的方法，可以将客户程序从具体类解耦
- 工厂方法使用继承：把对象的创建委托给子类，子类实现工厂方法来创建对象
- 抽象工厂使用对象组合：对象的创建被实现在工厂接口锁暴露出来的方法中
- 所有工厂模式都通过减少应用程序和具体类之间的依赖促进松耦合
- 工厂方法允许类将实例化延迟到子类进行
- 抽象工厂创建相关的对象家族，而不需要依赖他们的具体类
- 依赖倒置原则，知道我们避免依赖具体类型，而要尽量依赖抽象
- 工厂是很有威力的技巧，帮助我们针对抽象编程，而不要针对具体类抽象

## [adapter factory 适配器模式](https://github.com/zhuzhenke/design-patterns/tree/master/adapter/src/main/java/com/design/pattern/adapter)
#### 适配器模式将一个类的接口，转换成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间。

- 有两种实现方式：对象适配器和类适配器
- 对象适配器使用组合，可以适配某个类，也可以适配该类的任何子类
- 类适配器使用继承，在这点上比较局限，只能够采用某个特定的被适配类
- 实际应用场景：jdk源码中的集合类，均实现Iterator(迭代器)接口，可以让你无需感知集合的类型，就可以遍历元素，并还能删除元素 
- 当需要使用一个现有的类而其接口并不符合你的需要时，就使用适配器
- 适配器改变接口以符合客户的期望

## [facade factory 外观模式](https://github.com/zhuzhenke/design-patterns/tree/master/facade/src/main/java/com/design/pattern/facade)
#### 外观模式提供了一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用。

- 当需要简化并同意一个很大的接口或者一群复杂的接口时，使用外观模式 
- 外观模式将客户从一个复杂的子系统中解耦
- 实现一个外观模式，需要将子系统组合进外观中，然后将工作委托给子系统进行
- 你可以将一个子系统实现一个以上的外观

## [singleton factory 单例模式](https://github.com/zhuzhenke/design-patterns/tree/master/singleton/src/main/java/com/design/pattern/singleton)
#### 单例模式确保一个类只有一个实例，并提供一个全局访问点。

- 单例模式确保程序中一个类最多只有一个实例
- 单例模式也提供访问这个实例的全局点
- 在Java中实现单例模式需要私有的构造器，一个静态方法和一个静态变量
- 确定在性能和资源上的限制，然后小心地选择适当的方案来实现单例，以解决多线程问题(我们必须认定所有的程序都是多线程的)
- 小心，如果你使用多个类加载器，可能导致单例失效而产生多个实例
- 如果使用JVM 1.2或之前的版本，你必须建立单例注册表，以免垃圾收集器将单例回收

## [command factory 命令模式](https://github.com/zhuzhenke/design-patterns/tree/master/command/src/main/java/com/design/pattern/command)
#### 命令模式：将请求封装成对象，这可以让你使用不同的请求，队列或者日志请求来参数化其他对象。命令模式也可以支持撤销操作。

- 命令模式将发出请求的对象和执行请求的对象解耦
- 在被解耦的两者之间是通过命令对象进行沟通的。命令对象封装了接收者和一个或一组动作
- 调用者通过调用命令对象的execute()发出请求，这会使得接收者的动作被调用
- 调用者可以接受命令当做参数，甚至在运行时动态地进行
- 命令可以支持撤销，做法是实现一个undo方法来回到execute()被执行前的状态
- 宏命令是命令的一种简单的延伸，允许调用多个命令，宏方法也可以支持撤销
- 实际操作时，很常见使用"聪明"命令对象，也就是直接实现了请求，而不是将工作委托给接收者
- 命令也可以用来实现日志和事务系统


## [template factory 模板方法模式](https://github.com/zhuzhenke/design-patterns/tree/master/template/src/main/java/com/design/pattern/template)
#### 模板方法模式在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。模板方法是的子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤。

- "模板方法"定义了算法的步骤，把这些步骤的实现延迟到子类
- 模板方法为我们提供了一种代码复用的重要技巧
- 模板方法的抽象类可以定义具体方法、抽象方法和钩子
- 抽象方法由子类实现
- 钩子是一种方法，它在抽象类中不做事，或者只做默认的事情，子类可以选择要不要去覆盖它
- 为了防止子类改变模板方法中的算法，可以将模板方法生命为final或private
- 好莱坞原则告诉我们，将决策权放在高层模板中，以便决定如何以及何时调用底层模板
- 你将在真实世界代码中看到模板方法的许多变体，不要期望他们全都是一眼就可以被你认出的
- 策略模式和模板方法模式都封装算法，策略使用的是组合，模板使用的是继承

## [strategy factory 策略模式](https://github.com/zhuzhenke/design-patterns/tree/master/strategy/src/main/java/com/design/pattern/strategy)
#### 策略模式：定义了算法族，分别封装起来，让它们之间可以相互替换，此模式让算法的变化独立于使用算法的客户。

## [proxy factory 代理模式](https://github.com/zhuzhenke/design-patterns/tree/master/proxy/src/main/java/com/design/pattern/proxy)
#### 代理模式：为另外一个对象提供一个替身或占位符已控制对这个对象的访问。

- 使用代理模式创建代表，让代表对象控制某对象的访问，被代理的对象可以是远程的对象(RMI)、创建开销大的对象(Image)或需要安全控制的对象
- 动态代理：不需要对每个真实执行类创建一个代理执行类，只需要在用到的时候动态创建，这就是动态代理
- InvocationHandler根本就不是proxy，它只是一个帮助proxy的类，proxy会把调用转发给它处理。Proxy本身是利用静态的Proxy.newProxyInstance()方法在运行时动态地创建的
- Proxy.isProxyClass(Class<?> cl)可以判断某个类是否是动态代理类
- 代理模式为另外一个对象提供代表，以便控制客户对对象的访问，管理访问的方式有许多种
- 远程代理管理远程对象之间的的交互
- 虚拟代理控制访问实例化开销大的对象
- 保护代理基于调用者控制对对象方法的访问
- 代理模式有许多变体，例如：缓存代理、同步代理、防火墙代理和写入时复制代理
- 代理在结构上类似装饰者，但是目的不同
- 装饰者模式为对象加上行为，而代理则是访问控制
- Java内置的代理支持，可以根据需要建立动态代理，并将所有调用分配到所选的处理器
- 就和其他的包装者一样，代理会造成你的设计中，类的数目增多


## [state factory 状态模式](https://github.com/zhuzhenke/design-patterns/tree/master/state/src/main/java/com/design/pattern/state)
#### 状态模式：状态模式允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类

- 状态模式允许一个对象基于内部状态而拥有不同的行为
- 和程序状态机(PSM)不同，状态模式用类代表状态
- Context会将行为委托给当前状态对象
- 通过将每个状态封装进一个类，我们把以后需要做的任何改变局部化了
- 状态模式和策略模式有相同的类图，但是它们的意图不同
- 策略模式通常会用行为或算法来配置Context类
- 状态模式允许Context随着状态的改变而改变行为
- 状态转化可以由State类或Context类控制
- 使用状态模式通常会导致设计类中的数目大量增加
- 状态类可以被多个Context实例共享

## [iterator factory 迭代器模式](https://github.com/zhuzhenke/design-patterns/tree/master/iterator/src/main/java/com/design/pattern/iterator)
#### 迭代器模式：提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露其内部的表示。

- 迭代器允许访问聚合的元素，而不需要暴露它的内部结构
- 迭代器将遍历聚合的工作封装在一个对象中
- 当使用迭代器的时候，我们依赖聚合提供遍历
- 迭代器提供了一个通用的接口，让我们遍历聚合的项，当我们编码使用聚合的项时，就可以使用多态机制

## [composite factory 组合模式](https://github.com/zhuzhenke/design-patterns/tree/master/composite/src/main/java/com/design/pattern/composite)
#### 组合模式：允许你将对象组成树形结构来表现"整体/部分"的层次结构。组合能让客户以一致的方式处理个别对象和对象组合

- 组合模式提供一个结构，可同时包含个别对象和组合对象
- 组合模式允许客户对个别对象以及组合对象一视同仁
- 组合结构内的任意对象成为组件，组件可以是组合，也可以是叶节点
- 在实现组合模式时，有许多设计上的折衷。你要根据需要平衡透明性和安全性

## 设计原则
- 封装变化
- 多用组合，少用继承
- 针对接口编程，不针对实现编程
- 为交互对象之间的松耦合设计而努力
- 类应该对扩展开放，对修改关闭
- 依赖抽象，不要依赖具体类
- "最少知识"原则：只和你的密友谈话（减少对象之间的交互）
- 好莱坞原则：别调用(打电话给)我们，我们会调用(打电话给)你
- 我们应该努力让一个类只分配一个责任


以上说明解释摘录/参考自[《Head First设计模式》](https://www.amazon.cn/dp/B0011FBU34/)