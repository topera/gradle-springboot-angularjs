angular.module('fruitsApp', []).controller('FruitsController', ['$scope', '$http', function ($scope, $http) {
    var model = this;
    model.fruits = [
    ];

    this.loadFruits = function() {
        $http.get('/load').then(function(response){
            model.fruits = response.data;
        });
    };

}]);