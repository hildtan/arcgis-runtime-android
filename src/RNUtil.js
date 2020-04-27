import {NativeModules} from 'react-native';

let rnUtil = NativeModules.RNUtil;
export class RNUtil {
  static refreshDraw() {
    return rnUtil.refreshDraw();
  }
}
