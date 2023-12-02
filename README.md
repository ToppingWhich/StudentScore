# 学生总成绩计算

该项目使用Java实现了一个学生类，用于表示学生以及他们在所注册课程中的得分。`Student` 类通过采用策略模式提供了在运行时灵活计算最终分数的功能。

## 使用的设计模式

- **策略模式：** 该项目采用策略模式来定义一系列算法（得分计算方法），并将每个算法封装在不同的策略类中（`AlgorithmA` 和 `AlgorithmB`）。`Student` 类持有对 `ScoringAlgorithm` 接口的引用，允许动态切换不同的得分计算策略。

## 类和接口

### 1. Student 类

`Student` 类表示一个学生，包括以下方法：

- `Student(String name)`: 用于使用姓名初始化学生的构造方法。
- `void setAssignmentScore(double as)`: 设置作业分数。
- `void setExamScore(double es)`: 设置考试分数。
- `void setScoringAlgorithm(ScoringAlgorithmStrategy algorithm)`: 动态设置得分计算算法。
- `Double getFinalScore()`: 使用选择的算法获取最终得分。

### 2. ScoringAlgorithmStrategy 接口

`ScoringAlgorithm` 接口定义了方法 `calculateFinalScore(Double assignmentScore, Double examScore)` 用于计算最终得分。

### 3. AlgorithmA 和 AlgorithmB 类

`ScoringAlgorithmStrategy` 接口的具体实现，代表不同的得分计算策略。

## 测试案例

`TestCase` 类演示了系统的功能，通过创建一个 `Student` 对象，设置分数，并在 `AlgorithmA` 和 `AlgorithmB` 之间动态切换以计算最终得分。

## 如何使用

1. 克隆仓库。
2. 使用 `javac *.java` 编译Java文件。
3. 使用 `java TestCase` 运行测试案例。

## 运行结果展示

![Result.gif](img%2FResult.gif)
