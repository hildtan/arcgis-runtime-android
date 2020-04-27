import React from 'react';
import {View, Button} from 'react-native';

import RNButton from './RNButton';
import MapView from './MapView';
import {RNUtil} from './RNUtil';

const App: () => React$Node = () => {
  const btnPress = () => {
    RNUtil.refreshDraw()
      .then((r) => {
        console.log(r);
      })
      .catch((e) => {
        console.log(e);
      });
  };
  return (
    <View style={{flex: 1}}>
      <Button
        title="刷新显示"
        onPress={btnPress}
        style={{width: 300, height: 50}}
      />
      {/*<RNButton style={{width: 300, height: 100, backgroundColor: 'red'}} />*/}
      {/*<MapView style={{width: 300, height: 100}} />*/}
      <MapView style={{flex: 1}} />
    </View>
  );
};

export default App;
