// Configure the AMD module loader
requirejs.config({
  //baseUrl: 'coffee',
  paths: {
    jquery:           'vendor/jquery-1.8.2.min',
    underscore:       'vendor/underscore-1.4.2',
    backbone:         'vendor/backbone-0.9.2',
    handlebars:       'vendor/handlebars-1.0.0.beta.6',
    text:             'vendor/require-text-2.0.3',
    chaplin:          'vendor/chaplin-1.0.0-pre-ffd76c5',
   'moment':          'vendor/moment-1.7.2',
   'moment.es':       'vendor/localization/es',
    cs:               'vendor/require-cs-0.4.2',
    'coffee-script':  'vendor/coffee-script-1.4.0'
  },
  shim: {
    backbone: {
      deps: ['underscore', 'jquery'],
      exports: 'Backbone'
    }
    ,underscore: {
      exports: '_'
    }
  }
});


define(['cs!trollboard_application'], function (TrollboardApplication) {
  var trollboardApplication = new TrollboardApplication();
  trollboardApplication.initialize();
});
