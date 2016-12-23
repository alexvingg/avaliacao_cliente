(function () {

  'use strict';

  angular
    .module('app')
    .controller('GlobalCtrl', GlobalCtrl);

  GlobalCtrl.$inject = ['$state'];

  function GlobalCtrl($state,Global) {
    var vm = this;
    vm.goto = goto;

    activate();

    function goto(state) {
      $state.go(state);
    }
  }

})();