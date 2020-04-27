import React from 'react';
import {View} from 'react-native';

import RNButton from './RNButton';
import MapView from './MapView';
const App: () => React$Node = () => {
  return (
    <View style={{flex: 1}}>
      {/*<Button title="测试按钮" />*/}
      {/*<RNButton style={{width: 300, height: 100, backgroundColor: 'red'}} />*/}
      {/*<MapView style={{width: 300, height: 100}} />*/}
      <MapView style={{flex: 1}} />
    </View>
  );
};

export default App;
