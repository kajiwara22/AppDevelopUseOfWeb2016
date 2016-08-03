# npm と materialize と webpackでつくるriot.js環境
[shigekitakeguchi/npm-webpack-riotjs](https://github.com/shigekitakeguchi/npm-webpack-riotjs)をベースに  
さらにmaterializeにも対応してみました。  
materializeを使っている例として、以下の例を実装してあります。  
## src/cardpanel.tag
``` html
<cardpanel>
    <div class="card-panel">
      <span class="blue-text text-darken-2">This is a card panel with dark blue text</span>
    </div>
</cardpanel>
```
## src/dropdown.tag
``` html
<dropdown>
  <!-- Dropdown Structure -->
  <ul id='dropdown1' class='dropdown-content'>
    <li><a href="#!">one</a></li>
    <li><a href="#!">two</a></li>
    <li class="divider"></li>
    <li><a href="#!">three</a></li>
  </ul>
  <!-- Dropdown Trigger -->
  <a class='dropdown-button btn' href='#' data-activates='dropdown1'>Drop Me!</a>
</dropdown>
```

また、ajaxを使うのはfetchじゃないか？ということらしいので、  
fetchのbabel対応を行なっています。  
[Riot.jsでAjaxではなくFetchを使って標準的なやりかたでAPIを取得する - Qiita](http://qiita.com/aggre/items/c36d8fe34551569e2e6f)

サンプルとしてhttp://localhost:8080/users 
にアクセスしてその結果を反映するといったことを行なっています。  
## src/scripts/users.tag
``` javascript
var self = this;
var child = this.tags;
    fetch( 'http://localhost:8080/users' )
    .then( function ( data ) {
        return data.json();
    } )
    .then( function ( json ) {
        self.users = json;
        self.update();
    } )
```

その他、fork元と異なる点として、Webpackの監視時にSourcemapの生成を行なっています。  
それ以外は基本fork元と同じです。  

開発用サーバーの立ち上げとWebpackでの監視は以下のコマンドで行えます。
```
npm start
```
