Then /^I rotate the device to landscape$/ do
  performAction('set_activity_orientation', 'landscape')
end

Then /^I rotate the device to portrait$/ do
  performAction('set_activity_orientation', 'portrait')
end
