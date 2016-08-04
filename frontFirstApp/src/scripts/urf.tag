<urf>
    <div class="row">
        <form class="col s12" onSubmit={ register }>
            <div class="row">
                <div class="input-field col s6">
                    <input id="user_id" type="text" class="validate">
                    <label for="user_id">UserID</label>
                </div>
                <div class="input-field col s6">
                    <input id="user_name" type="text" class="validate">
                    <label for="user_name">UserName</label>
                </div>
            </div>
            <div class="row">
                <button class="waves-effect waves-light btn col s12">button</button>
            </div>
        </form>
    </div>
    <script>
        this.register = function(e){
            const userId = this.user_id.value;
            const userName = this.user_name.value;
            e.preventDefault();
            console.log(userId);
            console.log(userName);
            fetch('http://localhost:8080/user/add', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({
                    id: userId,
                    name: userName,
                })
            }).then(function(response) {
                return response.text();
            }).then(function(text) {
                console.log(text);
                riot.route('users')
            });
        }

    </script>
</urf>