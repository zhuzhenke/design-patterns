本模块代码基于糖果机状态变化对其行为的变化案例（参考自《Head First 设计模式》）


![](https://raw.githubusercontent.com/zhuzhenke/design-patterns/master/state/src/main/resources/candy-machine-state-flow.png)

状态有
1、初始状态：没有硬币，可以投币
2、有硬币状态：可以退币到初始状态，也可以转动曲柄，拿到糖果，到达售出状态
3、售出状态：转动曲柄后的状态，当糖果数量为0时，则是售空状态；当还有糖果剩余时，返回到初始状态
4、售空状态：糖果机的糖果数量为0

