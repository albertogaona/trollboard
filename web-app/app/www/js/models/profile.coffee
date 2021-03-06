define [
  'conf/config'
  'cs!models/base/model'
], (config, Model) ->
  'use strict'

  class Profile extends Model

    initialize: (attributes, options)->
      super
      if options and options.load
        @url = config.profile + attributes.access_token
        @initDeferred()

        @fetch success: (collection, response)->
          collection.resolve()
