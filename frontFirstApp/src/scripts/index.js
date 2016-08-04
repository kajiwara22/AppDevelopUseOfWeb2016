require("materialize-loader");
require('materialize-css/dist/js/materialize.js');
require('./app.tag');
require('./users.tag');
require('./urf.tag');
require('./cardpanel.tag');
require('./dropdown.tag');
require('./notfound.tag');

riot.mount('*');
var
    Route = riot.router.Route,
    DefaultRoute = riot.router.DefaultRoute,
    NotFoundRoute = riot.router.NotFoundRoute,
    RedirectRoute = riot.router.RedirectRoute;
riot.router.routes([
    new Route({path: 'app',tag: 'app'}),
    new Route({path: 'users',tag: 'users'}),
    new Route({path: 'add',tag: 'urf'}),
    new DefaultRoute({tag: 'users'}),
    new RedirectRoute({from: 'h', to: 'urf'}),
    new NotFoundRoute({tag: 'notfound'})
]);
riot.router.start();

