'use strict';

angular.module('mnpOmApp').controller('BookDialogController',
    ['$scope', '$stateParams', '$modalInstance', 'entity', 'Book', 'Author',
        function($scope, $stateParams, $modalInstance, entity, Book, Author) {

        $scope.book = entity;
        $scope.authors = Author.query();
        $scope.load = function(id) {
            Book.get({id : id}, function(result) {
                $scope.book = result;
            });
        };

        var onSaveFinished = function (result) {
            $scope.$emit('mnpOmApp:bookUpdate', result);
            $modalInstance.close(result);
        };

        $scope.save = function () {
            if ($scope.book.id != null) {
                Book.update($scope.book, onSaveFinished);
            } else {
                Book.save($scope.book, onSaveFinished);
            }
        };

        $scope.clear = function() {
            $modalInstance.dismiss('cancel');
        };
}]);
