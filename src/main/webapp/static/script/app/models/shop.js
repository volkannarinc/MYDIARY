define(function (require) {
    "use strict";
    var Backbone = require('backbone'),
    Shop = Backbone.Model.extend({
        urlRoot: '../../MYDIARY/api/notes',
        idAttribute: "id"
    }),
    Shops = Backbone.Collection.extend({
        url: '../../MYDIARY/api/notes'
    });
    return {
            Shop: Shop,
            Shops: Shops
    };
});