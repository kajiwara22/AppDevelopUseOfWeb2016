require('./user.tag');
<users>
    <user each={users}></user>
<script>
    this.users = '( Loading... )'
    var self = this;
    var child = this.tags;
        fetch( 'http://localhost:8080/users' )
        .then( function ( data ) {
            return data.json();
        } )
        .then( function ( json ) {
            console.log(json);
            self.users = json;
            self.update();
        } )


</script>
</users>