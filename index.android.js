'use strict';

import React from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View
} from 'react-native';

class HelloWorld extends React.Component {
    render() {
      return (
        <View style={styles.container}>
          <Text style={styles.welcome}>
            这就是RN的页面哦
          </Text>
        <Text style={styles.hello}>我是刘成</Text>

        </View>
      );
    }
    func1=()=>{
      this.func2()
    }
    func2=()=>{
      alert('abcs')
    }
  }

  const styles = StyleSheet.create({
    container: {
      flex: 1,
      justifyContent: 'center',
      alignItems: 'center',
      backgroundColor: '#F5FCFF',
    },
    welcome: {
      fontSize: 20,
      textAlign: 'center',
      margin: 10,
    },
    instructions: {
      textAlign: 'center',
      color: '#333333',
      marginBottom: 5,
    },
  });
AppRegistry.registerComponent('HelloWorld', () => HelloWorld);
