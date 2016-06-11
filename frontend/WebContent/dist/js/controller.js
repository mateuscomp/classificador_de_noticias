var MESSAGE_ERROR = "Ops! I'm sorry."; 
var ADDRESS_IMAGE_HAPPY = "images/happyImage.svg";
var ADDRESS_IMAGE_SAD = "images/sadImage.svg";
var ADDRESS_IMAGE_ERROR = "images/errorImage.svg";
var app = angular.module("NewsManagement", []);
         
            app.controller("NewsManagementController", function($scope, $http) {
               
                $scope.submitNews = function() {
                    var url = "http://52.40.55.6:8080/system/evaluateANews?title="+$scope.form.searchFor;
                    $http({
	                     method : 'GET',
	                     url : url
	                 }).then(function successCallback(response) {
	                	 provide_answer(ADDRESS_IMAGE_HAPPY, response);
	                 }, function errorCallback(response) {
	                	 provide_answer(ADDRESS_IMAGE_SAD, response);
	                 });
               };
                function clearForm() {
                    $scope.form.searchFor = "";
                };
                
                function provide_answer(addressImage, response) {
                	if (response.data == null || response.status == 404) {
                		$('#textAnswer').text(MESSAGE_ERROR);
                		$('#image').attr('src', ADDRESS_IMAGE_ERROR);
                	}else{
                		$('#textAnswer').text(response.data.message);
                		$('#image').attr('src', addressImage);
                	}
                	$("#searchString").hide("slow");
                    $("#answerString").show("slow");
                    console.log(response.statusText);
                    clearForm();
                };
            });