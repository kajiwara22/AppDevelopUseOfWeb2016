var webpack = require("webpack");
const path = require('path');
module.exports = {
  entry: './src/scripts/index.js',
  output: {
    path: path.join(__dirname, 'app', 'scripts'),
    filename: 'bundle.js',
  },
  module: {
    preLoaders: [
      {
        test: /\.tag$/,
        exclude: /node_modules/,
        loader: 'riotjs-loader',
        query: {
          type: 'babel'
        }
      }
    ],
    loaders: [
      {
        test: /\.js$|\.tag$/,
        exclude: /node_modules/,
        loader: 'babel-loader'
      },
      {test: /\.scss$/,                     loader: 'style!css!sass'},
      { test: /\.woff(2)?(\?v=[0-9]\.[0-9]\.[0-9])?$/, loader:"url" },
      { test: /\.(ttf|eot|svg)(\?v=[0-9]\.[0-9]\.[0-9])?$/, loader: "file" }
    ]
  },
  resolve: {
      extensions: ['', '.js', '.tag']
  },
  plugins: [
    new webpack.optimize.UglifyJsPlugin(),
    new webpack.ProvidePlugin({
      riot: 'riot',
      'fetch': 'imports?this=>global!exports?global.fetch!whatwg-fetch'
    })
  ]
}
