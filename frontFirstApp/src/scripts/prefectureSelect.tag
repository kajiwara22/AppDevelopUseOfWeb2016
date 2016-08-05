<prefectureSelect>
    <div class="row">
        <div class="input-field col s12">
            <select class="col s12">
                <option  value="" disabled selected>Choose your option</option>
                <option each ="{prefectures}" value="{id}" >{name}</option>
            </select>
            <label>Materialize Select</label>
        </div>
    </div>

    <script>
        var self = this;
        fetch( 'http://localhost:8080/prefectures' )
                .then( function ( data ) {
                    return data.json();
                } )
                .then( function ( json ) {
                    self.prefectures = json;
                    self.update();
                    $('select').material_select();
                } )
    </script>
</prefectureSelect>