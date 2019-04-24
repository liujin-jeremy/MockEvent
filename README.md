## 模拟手势操作

### 引入

```
implementation 'tech.liujin:mockevent:1.0.0'
```

## 使用

```
private MockEvent mMockEvent = new MockEvent();
```

```
// 分发down事件
mMockEvent.dispatchDown( mImage );
```

```
// 分发移动事件
mMockEvent.dispatchMoveBy( mImage, 50, 50 );
```

```
// 分发up事件
mMockEvent.dispatchUp( mImage );
```

