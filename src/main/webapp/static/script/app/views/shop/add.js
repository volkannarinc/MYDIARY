define(function (require) {
    "use strict";
    var $                   = require('jquery'),
        _                   = require('underscore'),
        Backbone            = require('backbone'),
        models              = require('app/models/shop'),
        tpl                 = require('text!template/add.html');

    return Backbone.View.extend({
        el: $('.page'),
        initialize: function(){
        },
        render: function(){
            var temp = _.template(tpl, {});
            this.$el.html(temp);
        },
        events:{
            'click .add' : 'addShop',
            'click .cancel' : 'cancelAddShop'
        },
        addShop: function(){
            var noteHeader1 = $('#noteHeader').val();
            var noteDescription1 = $('#noteDescription').val();

            if(noteHeader1.length < 1 || noteDescription1.length < 1){
                alert('Please fill in form first!');
            }else{

                var shop = new models.Shop({noteHeader: noteHeader1, noteDescription: noteDescription1});
                shop.save(null,{
                    success: function(){
                        var Router = require('app/router');
                        var router = new Router();
                        router.navigate('', {trigger:true});
                    }
                });

            }
        },
        cancelAddShop: function(){
            var Router = require('app/router');
            var router = new Router();
            router.navigate('',{trigger:true});
        }
    });
});